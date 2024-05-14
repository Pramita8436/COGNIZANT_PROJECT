import axios from 'axios'

const DEPARTMENT_REST_API_BASE_URL = 'http://localhost:8080/api/technicaldepartment'

export const getAllTechnicaldepartment = () =>  axios.get(DEPARTMENT_REST_API_BASE_URL);

export const createTechnicaldepartment = (technicaldepartment) => axios.post(DEPARTMENT_REST_API_BASE_URL, technicaldepartment);

export const getTechnicaldepartmentById = (tdegreeid) => axios.get(DEPARTMENT_REST_API_BASE_URL + '/'+ tdegreeid);

export const updateTechnicaldepartment = (tdegreeid, technicaldepartment ) => axios.put(DEPARTMENT_REST_API_BASE_URL + '/'+ tdegreeid,technicaldepartment);

export const deleteTechnicaldepartment = (tdegreeid) => axios.delete(DEPARTMENT_REST_API_BASE_URL + '/' + tdegreeid);


