package com.dsa.tracker.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsa.tracker.entity.Problem;
import com.dsa.tracker.repository.ProblemRepository;

@Service
public class ProblemService {
    private static final Logger logger = LoggerFactory.getLogger(ProblemService.class);

	@Autowired 
	private ProblemRepository problemRepository;
	
	public Problem saveProblem(Problem problem) {
		return problemRepository.save(problem);
	}

	public List<Problem> getAllProblems() {
		return problemRepository.findAll() ;
	}

    public Problem getProblemById(Long id) {
        return problemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Problem not found"));
    }


	public void deleteProblem(Long id) {
		 if (!problemRepository.existsById(id)) {
		        throw new RuntimeException("Problem not found");
		    }
	 problemRepository.deleteById(id);
		
	}


	public List<Problem> findByDifficulty(String difficulty){
		return problemRepository.findByDifficulty(difficulty);
	}
	public List <Problem> findByPlatform(String platform) {
		return problemRepository.findByPlatform(platform);
		
	}
	public Problem updateProblem(Long id, Problem newProblem) {
	    Problem existing = problemRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Problem not found"));

	    existing.setTitle(newProblem.getTitle());
	    existing.setTopic(newProblem.getTopic());
	    existing.setDifficulty(newProblem.getDifficulty());
	    existing.setStatus(newProblem.getStatus());
	    existing.setPlatform(newProblem.getPlatform());
	    existing.setNotes(newProblem.getNotes());
	    existing.setDateSolved(newProblem.getDateSolved());

	    return problemRepository.save(existing);
	}
	
	public Problem updatePartial(Long id, Map<String, Object> updates) {
        logger.info("Updating problem with id: {}", id);


	    Problem problem = problemRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Problem not found"));

	    updates.forEach((key, value) -> {
	        switch (key) {
	            case "title":
	                problem.setTitle((String) value);
	                break;
	            case "topic":
	                problem.setTopic((String) value);
	                break;
	            case "difficulty":
	                problem.setDifficulty((String) value);
	                break;
	            case "status":
	                problem.setStatus((String) value);
	                break;
	            case "platform":
	                problem.setPlatform((String) value);
	                break;
	            case "notes":
	                problem.setNotes((String) value);
	                break;
	                
	            case "dateSolved":
	            	try {
	            	problem.setDateSolved(LocalDate.parse((String) value));
	            	}catch(Exception e) {
	            		throw new RuntimeException("Invalid date format.use yyyy-mm-dd");
	            	}
	    break;
	        }
	    });
        logger.info("Problem updated successfully with id: {}", id);


	    return problemRepository.save(problem);
	}
}
