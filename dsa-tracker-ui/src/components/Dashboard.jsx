import { useEffect, useState } from "react";
import axios from "axios";
import AddProblem from "./AddProblem";

function Dashboard() {

    const [problems, setProblems] = useState([]);

    const fetchProblems = () => {

        const token = localStorage.getItem("token");

        axios.get("http://localhost:8080/problems", {
            headers: {
                Authorization: `Bearer ${token}`
            }
        })
        .then(response => {
            setProblems(response.data);
        })
        .catch(error => {
            console.log(error);
        });

    };

    useEffect(() => {

        fetchProblems();

    }, []);

    const logout = () => {

        localStorage.removeItem("token");

        window.location.reload();

    };

    return (

        <div className="dashboard">

            <div className="top-bar">

                <h1>DSA Tracker Dashboard</h1>

                <button onClick={logout}>
                    Logout
                </button>

            </div>

            <AddProblem refreshProblems={fetchProblems} />

            <div className="problem-list">

                {
                    problems.map(problem => (

                        <div className="card" key={problem.id}>

                            <h3>{problem.title}</h3>

                            <p>Topic: {problem.topic}</p>

                            <p>Difficulty: {problem.difficulty}</p>
                            <p>status: {problem.status}</p>
                            <p>platform: {problem.platform}</p>
                            <p>notes: {problem.notes}</p>
                            <p>dateSolved: {problem.dateSolved}</p>





                        </div>

                    ))
                }

            </div>

        </div>

    );

}

export default Dashboard;