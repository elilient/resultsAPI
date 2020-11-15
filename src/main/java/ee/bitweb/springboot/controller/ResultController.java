package ee.bitweb.springboot.controller;

import ee.bitweb.springboot.model.Result;
import ee.bitweb.springboot.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")

public class ResultController {
    @Autowired
    private static ResultRepository resultRepository;

    @GetMapping("voting")
    public List<Result> getResults() {
        return this.resultRepository.findAll();
    }

    @PostMapping("voting")
    public static Result postVote(@RequestBody Result data) {
        return resultRepository.save(data);
    }

}
