import React, { useEffect, useState } from 'react'
import { deleteTechnicaldepartment, getAllTechnicaldepartment } from '../services/TechnicalDepartmentService'
import { Link , useNavigate } from 'react-router-dom';

const ListTechnicaldepartmentComponent = () => 
{



 const [technicalDepartment, setTechnicaldepartment] = useState([]);   
 
const navigator = useNavigate();


    useEffect(() => { listOFTechnicaldepartment();},[])

        function  listOFTechnicaldepartment()
        {
          getAllTechnicaldepartment().then((response)=>{
            console.log(response.data);
            setTechnicaldepartment(response.data);
        }).catch(error=>  
            { console.error(error);
            })
        }


                function updateTechnicaldepartment(id){
                  navigator(`/updateTechnicaldepartment/${id}`)
                }

function removeTechnicaldepartment(id)
{
    deleteTechnicaldepartment(id).then((response) => {
        console.log(response.data);
        listOFTechnicaldepartment();
    }).catch(error => {
        console.error(error);
    })
}




  return (
    <div className='container'>
         <h2 className='text-center'>List Of Technical Degree</h2>
      {/* <Link to='/addDegree' className='btn btn-dark mb-2 offset-md-3'>Add Degree</Link> */}
        <table className= 'table-striped table-bordered col-md-6 offset-md-3 offset-md-3' style={{ backgroundColor: 'rgba(255, 255, 255, 0.5)', backgroundColor: 'rgba(247, 220, 111, 0.4)' }}>
            <thead>
                <tr>
                    <th>Degree ID</th>
                   <th>Degree Name</th>
                   <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                    {
                        technicalDepartment.map( technicaldepartment => 
                            <tr key= {technicaldepartment.tdegreeid}>
                               <td> {technicaldepartment.tdegreeid}</td>
                               <td> {technicaldepartment.tdegreename}</td>
                               <td>
                               <button onClick={() => updateTechnicaldepartment(technicaldepartment.tdegreeid) } className='btn btn-warning'>Update</button>
                              <button onClick={() => removeTechnicaldepartment(technicaldepartment.tdegreeid) } className='btn btn-danger' 
                              style={{marginLeft: "10px"}}>Delete</button>
                               
                               </td>
                               </tr>
                               )
                            }
                               </tbody>
                               </table>
                               </div>
                                 )
                            }

export default ListTechnicaldepartmentComponent;