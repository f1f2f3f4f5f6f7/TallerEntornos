import axios from 'axios';

// Configuración base de axios
const api = axios.create({
  baseURL: '/api',
  headers: {
    'Content-Type': 'application/json'
  }
});

// Servicios de Usuario
export const userService = {
  login: (code, password) => api.get(`/login/${code}/${password}`),
  register: (userData) => api.post('/register', userData),
  getAllUsers: () => api.get('/list'),
  getUserById: (id) => api.get(`/${id}`),
  updateUser: (id, userData) => api.put(`/update/${id}`, userData),
  deleteUser: (id) => api.delete(`/delete/${id}`),
  getUserPurchases: (id) => api.get(`/${id}/purchases`)
};

// Servicios de Combos
export const comboService = {
  getAllCombos: () => api.get('/combos'),
  createCombo: (comboData) => api.post('/combos', comboData),
  updateCombo: (id, comboData) => api.put(`/combos/${id}`, comboData),
  deleteCombo: (id) => api.delete(`/combos/${id}`)
};

// Servicios de Compras
export const buyService = {
  createBuy: (buyData) => api.post('/buy', buyData),
  getAllBuys: () => api.get('/buy'),
  getBuyById: (id) => api.get(`/buy/${id}`),
  updateBuy: (id, buyData) => api.put(`/buy/${id}`, buyData),
  deleteBuy: (id) => api.delete(`/buy/${id}`)
};

// Servicios de QR
export const qrService = {
  getQrImage: (buyId) => api.get(`/qrcode/${buyId}`, { responseType: 'blob' }),
  generateQr: (buyId) => api.post(`/qrcode/generate/${buyId}`)
};

// Servicios de Reportes
export const reportService = {
  getAllReports: () => api.get('/reports'),
  getReportsByDate: (date) => api.get(`/reports/by-date?date=${date}`),
  getReportsBetweenDates: (startDate, endDate) => 
    api.get(`/reports/with-buys/between-dates?startDate=${startDate}&endDate=${endDate}`)
};

// Servicios de Valores de Compra
export const purchaseValueService = {
  getAllValues: () => api.get('/purchase-value'),
  getValueById: (id) => api.get(`/purchase-value/${id}`),
  createValue: (valueData) => api.post('/purchase-value', valueData),
  updateValue: (id, valueData) => api.put(`/purchase-value/${id}`, valueData)
};

export default api;