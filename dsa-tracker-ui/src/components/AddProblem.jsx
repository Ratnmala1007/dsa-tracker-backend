import { useState } from "react";
import axios from "axios";

function AddProblem({ refreshProblems }) {

   const [problem, setProblem] = useState({
    title: "",
    topic: "",
    difficulty: "",
    status: "",
    platform: "",
    notes: "",
    //dateSolved: ""
});

    const handleChange = (e) => {

        setProblem({
            ...problem,
            [e.target.name]: e.target.value
        });

    };

    const handleSubmit = async (e) => {

        e.preventDefault();

     

 const token = localStorage.getItem("token");

const formData = problem;

try {

    const response = await axios.post(
        "http://localhost:8080/problems",
        formData,
        {
            headers: {
                Authorization: `Bearer ${token}`,
                "Content-Type": "application/json"
            }
        }
    );

    alert("Problem Added Successfully");

    setProblem({
        title: "",
        topic: "",
        difficulty: "",
        status: "",
        platform: "",
        notes: "",
        dateSolved: ""
    });

    refreshProblems();

} catch (error) {

    console.log(error);

    alert("Failed to add problem");

}
    };

    return (

        <div className="add-form">

            <h2>Add Problem</h2>

            <form onSubmit={handleSubmit}>

                <input
                    type="text"
                    name="title"
                    placeholder="Problem Title"
                    value={problem.title}
                    onChange={handleChange}
                />

                <input
                    type="text"
                    name="topic"
                    placeholder="Topic"
                    value={problem.topic}
                    onChange={handleChange}
                />

                <input
                    type="text"
                    name="difficulty"
                    placeholder="Difficulty"
                    value={problem.difficulty}
                    onChange={handleChange}
                />
                 <input
                    type="text"
                    name="status"
                    placeholder="status"
                    value={problem.status}
                    onChange={handleChange}
                /> 

                <input
                    type="text"
                    name="platform"
                    placeholder="platform"
                    value={problem.platform}
                    onChange={handleChange}
                />
                <input
                    type="text"
                    name="notes"
                    placeholder="notes"
                    value={problem.notes}
                    onChange={handleChange}
                />
                <input
                    type="date"
                    name="dateSolved"
                    placeholder="dateSolved"
                    value={problem.dateSolved}
                    onChange={handleChange}
                />
                <button type="submit">
                    Add Problem
                </button>

            </form>

        </div>

    );

}

export default AddProblem;