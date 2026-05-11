import { useState } from "react";
import axios from "axios";

function Login() {

    const [user, setUser] = useState({
        username: "",
        password: ""
    });

    const handleChange = (e) => {

        setUser({
            ...user,
            [e.target.name]: e.target.value
        });

    };

    const handleSubmit = async (e) => {

        e.preventDefault();

        try {

            const response = await axios.post(
                "http://localhost:8080/auth/login",
                user
            );

            console.log(response.data);

            // Store token
            localStorage.setItem("token", response.data.token);

window.location.reload();
        } catch (error) {

            console.log(error);

            alert("Invalid Credentials");

        }

    };

    return (

        <div className="form-container">

            <h2>Login</h2>

            <form onSubmit={handleSubmit}>

                <input
                    type="text"
                    name="username"
                    placeholder="Enter Username"
                    value={user.username}
                    onChange={handleChange}
                />

                <input
                    type="password"
                    name="password"
                    placeholder="Enter Password"
                    value={user.password}
                    onChange={handleChange}
                />

                <button type="submit">
                    Login
                </button>

            </form>

        </div>

    );

}

export default Login;