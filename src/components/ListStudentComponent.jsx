import React,{useEffect, useState} from 'react'
import { deleteStudent, listStudent } from '../services/StudentService'
import { useNavigate } from 'react-router-dom'


const ListStudentComponent = () => {
const [student, setStudent] = useState([])
const navigator = useNavigate();



useEffect(() =>{getAllStudent();},[])



function getAllStudent()
{
    listStudent().then((response)=>{setStudent(response.data);})
.catch(error=>  { console.error(error);})
}




// function addNewStudent(){
// navigator('/addstudent')

// }




function updateStudent(id){
    navigator(`/updatestudent/${id}`)
}




function  removeStudent (id)
{
    console.log(id);
    deleteStudent(id).then((response) => {getAllStudent();})
    .catch(error => {console.error(error); })
}  




  return (
    <div className='container'>
        <h2 className='text-center'>List Of Students</h2>
        {/* <button className ='btn btn-info mb-2 offset-md-2' onClick={addNewStudent}>Add Student</button> */}
        <table className=' table-striped table-bordered col-md-9 offset-md-2 offset-md-2 ' style={{ backgroundColor: 'rgba(255, 255, 255, 0.5)' , backgroundColor: 'rgba(247, 220, 111, 0.4)' }}>
            <thead>
                <tr>
                    <th>Unique ID</th>
                   <th>First Name</th>
                   <th>Last Name</th>
                   <th>Email</th>
                   <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                    {
                        student.map(student => 
                            <tr key={student.id}>
                               <td>{student.id}</td>
                               <td>{student.firstname}</td>
                               <td>{student.lastname}</td>
                               <td>{student.email}</td>
                               <td>
                                <button className='btn btn-primary' onClick={() => updateStudent(student.id)}>Update</button>
                                <button className='btn btn-danger' onClick={() => removeStudent(student.id)}
                                
                                style={{marginLeft: '10px' }}

                                >Delete</button>
                               </td>
                               </tr> )
                    }
            </tbody>
        </table>
    </div>
  )
}

export default ListStudentComponent;