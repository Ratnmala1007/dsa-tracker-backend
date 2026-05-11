import { useState } from "react";
import axios from "axios";

function Register() {

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
console.log("Register button clicked");
        try {

            const response = await axios.post(
                "http://localhost:8080/auth/register",
                user
            );

            alert(response.data);

            setUser({
                username: "",
                password: ""
            });

        } catch (error) {

            console.log(error);

            alert("Registration failed");

        }

    };

    return (

        <div className="form-container">

            <h2>Register</h2>

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
                    Register
                </button>

            </form>

        </div>

    );

}

export default Register;