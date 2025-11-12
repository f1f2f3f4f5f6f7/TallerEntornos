import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';
import axios from 'axios';
import './Login.css';

const Login = () => {
  const [showBase, setShowBase] = useState(true);
  const [code, setCode] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const navigate = useNavigate();
  const { login } = useAuth();

  const toggleDisplay = () => {
    setShowBase(!showBase);
    setError('');
  };

  const handleLogin = async (e) => {
    e.preventDefault();
    setError('');

    try {
      const response = await axios.get(`/api/login/${code}/${password}`);
      
      if (response.data) {
        login(response.data);
        
        // Redirigir según el rol
        if (response.data.rol === 'Estudiante') {
          navigate('/lobby');
        } else if (response.data.rol === 'Admin') {
          navigate('/admin');
        }
      }
    } catch (err) {
      setError('Usuario o contraseña incorrectos');
      console.error('Error en login:', err);
    }
  };

  return (
    <div className="login-container">
      {showBase && (
        <div className="base">
          <div className="logito"></div>
          <button className="btn-login" onClick={toggleDisplay}>
            Inicia Sesión
          </button>
        </div>
      )}

      {!showBase && (
        <div className="centered-rectangle">
          <h2 className="text-center">Bienvenido</h2>
          <form onSubmit={handleLogin}>
            {error && <div className="alert alert-danger">{error}</div>}
            
            <div className="mb-3">
              <input
                type="text"
                className="form-control"
                placeholder="Usuario"
                value={code}
                onChange={(e) => setCode(e.target.value)}
                required
              />
            </div>

            <div className="mb-3">
              <input
                type="password"
                className="form-control"
                placeholder="Contraseña"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
              />
              <a href="#" className="forgot-pass">¿Olvidó su contraseña?</a>
            </div>

            <button type="submit" className="btn-Ingresar">
              Ingresar
            </button>
          </form>
        </div>
      )}
    </div>
  );
};

export default Login;