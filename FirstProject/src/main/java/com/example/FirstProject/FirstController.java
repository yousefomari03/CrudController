package com.example.FirstProject;

import com.example.FirstProject.DTOs.PostDTO;
import com.example.FirstProject.DTOs.PutDTO;
import com.example.FirstProject.services.DeleteService;
import com.example.FirstProject.services.GetService;
import com.example.FirstProject.services.PostService;
import com.example.FirstProject.services.PutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hello")
public class FirstController {
    GetService getService;
    PostService postService;
    PutService putService;
    DeleteService deleteService;

    @Autowired
    public FirstController(GetService getService, PostService postService, PutService putService, DeleteService deleteService) {
        this.getService = getService;
        this.postService = postService;
        this.putService = putService;
        this.deleteService = deleteService;

    }

    @GetMapping()
    public String get(@RequestParam int id) {
        return getService.getservice(id);
    }

    @PostMapping()
    public String post(@RequestBody PostDTO postDTO) {
        System.out.println(postDTO);
        return postService.postservice();

    }

    @PutMapping()
    public String PUT(@RequestBody PutDTO putDTO) {
        return putService.putservice();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return deleteService.deleteservice(id);
    }
}
