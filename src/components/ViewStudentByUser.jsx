import React,{useEffect, useState} from 'react'
import {listStudent } from '../services/StudentService'

const ViewStudentByUser = () => {

    const [student, setStudent] = useState([])

    useEffect(() =>{getAllStudent();},[])



function getAllStudent()
{
    listStudent().then((response)=>{setStudent(response.data);})
.catch(error=>  { console.error(error);})
}
    

  return (
    
    <div className='container'>
      <h2 className='text-center'>List Of Students</h2>
              <table className='$table-bg:transparent;  table-striped table-bordered col-md-9 offset-md-2 offset-md-2 ' style={{ backgroundColor: 'rgba(255, 255, 255, 0.5)' }}>
                  <thead>
                      <tr>
                          <th>Unique ID</th>
                          <th>First Name</th>
                          <th>Last Name</th>
                          <th>Email</th>
                      </tr>
                  </thead>
                  <tbody>
                      {student.map(student => (<tr key={student.id}>
                          <td>{student.id}</td>
                          <td>{student.firstname}</td>
                          <td>{student.lastname}</td>
                          <td>{student.email}</td>
                      </tr>))}
                  </tbody>
              </table>
          </div>
);
}

export default ViewStudentByUser;