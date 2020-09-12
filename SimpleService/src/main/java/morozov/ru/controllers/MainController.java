package morozov.ru.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import morozov.ru.models.PostModel;
import morozov.ru.repositories.SimpleRepo;

@RestController
public class MainController {

	private static final Logger LOG = LogManager.getLogger(MainController.class);
	
	private SimpleRepo simpleRepo;
	
	@Autowired
	public MainController(SimpleRepo simpleRepo) {
		this.simpleRepo = simpleRepo;
	}

	@GetMapping("/post")
    public List<PostModel> getAll() {
		LOG.info(">>>>> reached GET /post");
		List<PostModel> posts = simpleRepo.findAll();
        return posts;
    }

    @PostMapping("/post")
    public PostModel getPost(@RequestBody PostModel post) {
    	LOG.info(">>>>> reached POST /post");
    	post = simpleRepo.save(post);
        return post;
    }
	
}