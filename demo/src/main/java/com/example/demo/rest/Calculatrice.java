package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Operateur;
import com.example.demo.DTO.Result;

@RestController
@RequestMapping("/cal")
public class Calculatrice {

	@PostMapping("/add")
	public ResponseEntity<Result> add (@RequestBody Operateur op) {
		Result r =  new Result(op.a() + op.b());
		return ResponseEntity.ok(r);
	}
	
	@PostMapping("/sous")
	public ResponseEntity<Result> sous (@RequestBody Operateur op) {
		Result r =  new Result(op.a() -  op.b());
		return ResponseEntity.ok(r);
	}
	
	@PostMapping("/multi")
	public ResponseEntity<Result> multi (@RequestBody Operateur op) {
		Result r =  new Result(op.a() *  op.b());
		return ResponseEntity.ok(r);
	}
	
	@PostMapping("/div")
	public ResponseEntity<?> division (@RequestBody Operateur op) {
		
		if(op.b() == 0) {
			return ResponseEntity.badRequest().body(" b didn't be equal to 0 ");
		}
		
		Result r =  new Result((float) op.a() /  (float)op.b());
		return ResponseEntity.ok(r);
	}
}
