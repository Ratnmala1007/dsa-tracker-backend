import { useState } from "react";
import Register from "./components/Register";
import Login from "./components/Login";
import Dashboard from "./components/Dashboard";
import "./App.css";

function App() {

  const [isLogin, setIsLogin] = useState(true);

  const token = localStorage.getItem("token");

  if(token) {
    return <Dashboard />;
  }

  return (

    <div className="main-container">

      <div className="form-box">

        {
          isLogin
            ? <Login />
            : <Register />
        }

        <div className="toggle-text">

          {
            isLogin ? (
              <p>
                Don't have an account?
                <span onClick={() => setIsLogin(false)}>
                  Register
                </span>
              </p>
            ) : (
              <p>
                Already have an account?
                <span onClick={() => setIsLogin(true)}>
                  Login
                </span>
              </p>
            )
          }

        </div>

      </div>

    </div>

  );

}

export default App;