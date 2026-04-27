package com.dsa.tracker.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsa.tracker.entity.Problem;
import com.dsa.tracker.service.ProblemService;

@RestController
@RequestMapping("/problems")

public class ProblemController {
    private static final Logger logger = LoggerFactory.getLogger(ProblemController.class);

	
	@Autowired
private ProblemService problemService;
	
	@PostMapping
	public Problem saveProblem(@RequestBody Problem problem ) {
	return problemService.saveProblem(problem);
	}
	
	@GetMapping
	public List<Problem> getAllProblems(){
		logger.info("get all records");
		return problemService.getAllProblems();
	}
	@GetMapping("/{id}")
	public Problem getProblemById(@PathVariable Long id) {
		return problemService.getProblemById(id);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProblem(@PathVariable Long id) {
		problemService.deleteProblem(id);
	    return ResponseEntity.ok("Problem deleted successfully");

	}
	
	@GetMapping("/difficulty/{difficulty}")
	public List<Problem> getByDifficulty(@PathVariable String difficulty){
		return problemService.findByDifficulty(difficulty);
	}
	@GetMapping("/platform/{platform}")
	public List<Problem> getByPlatform(@PathVariable String platform){
		return problemService.findByPlatform(platform);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Problem> updateProblem(
	        @PathVariable Long id,
	        @RequestBody Problem problem) {
	    return ResponseEntity.ok(problemService.updateProblem(id, problem));
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Problem> updatePartial(
	        @PathVariable Long id,
	        @RequestBody Map<String, Object> updates) {
        logger.info("PATCH request received for id: {}", id);

	    return ResponseEntity.ok(problemService.updatePartial(id, updates));
	}
}
