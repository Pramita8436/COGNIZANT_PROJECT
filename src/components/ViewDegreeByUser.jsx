import React,{useEffect, useState} from 'react'
import { getAllTechnicaldepartment } from '../services/TechnicalDepartmentService'

const ViewDegreeByUser = () => {

    const [technicalDepartment, setTechnicaldepartment] = useState([]); 

    
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

  return (
          <div className='container'>
             <h2 className='text-center'>List Of Technical Degree</h2>
                    <table className='$table-bg:transparent;  table-striped table-bordered col-md-9 offset-md-2 offset-md-2 ' style={{ backgroundColor: 'rgba(255, 255, 255, 0.5)' }}>
                        <thead>
                            <tr>
                                <th>Degree ID</th>
                                <th>Degree Name</th>
                            </tr>
                        </thead>
                        <tbody>
                        {
                        technicalDepartment.map( technicaldepartment => 
                            (<tr key= {technicaldepartment.tdegreeid}>
                               <td> {technicaldepartment.tdegreeid}</td>
                               <td> {technicaldepartment.tdegreename}</td>
                               </tr>
                              ) )}
                               </tbody>
                           </table>
                       </div>
             );
}

export default ViewDegreeByUser;

