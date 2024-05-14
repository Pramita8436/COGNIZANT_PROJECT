import { Link, useNavigate } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
 
const AdminHeader = () => {
  let navigate = useNavigate();
 
  const user = JSON.parse(sessionStorage.getItem("active-admin"));
  console.log(user);
 
  const adminLogout = () => {
    toast.success("logged out!!!", {
      position: "top-center",
      autoClose: 1000,
      hideProgressBar: false,
      closeOnClick: true,
      pauseOnHover: true,
      draggable: true,
      progress: undefined,
    });
    sessionStorage.removeItem("active-admin");
    window.location.reload(true);
    navigator("/user/login");
  };
 
  return (
    <ul class="navbar-nav ms-auto mb-2 mb-lg-0 me-5">
      <li class="nav-item">
        <Link to="/addstudent" class="nav-link active" aria-current="page">
          <b className="text-color"> Add Student</b>
        </Link>
      </li>
 
      <li class="nav-item">
        <Link to="/student" class="nav-link active" aria-current="page">
          <b className="text-color">List of Students</b>
        </Link>
      </li>
 
      <li class="nav-item">
        <Link
          to="/addDegree"
          class="nav-link active"
          aria-current="page"
        >
          <b className="text-color">Add Degree</b>
        </Link>
      </li>
 
      <li class="nav-item">
        <Link
          to="/technicaldepartment"
          class="nav-link active"
          aria-current="page"
        >
          <b className="text-color">List of Technical Degree</b>
        </Link>
      </li>
 
      <li class="nav-item">
        <Link
          to="/user/login"
          class="nav-link active"
          aria-current="page"
          onClick={adminLogout}
        >
          <b className="text-color">Logout</b>
        </Link>
        <ToastContainer />
      </li>
    </ul>
  );
};
 
export default AdminHeader;