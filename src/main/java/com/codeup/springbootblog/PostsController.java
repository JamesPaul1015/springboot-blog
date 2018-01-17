package com.codeup.springbootblog;
import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

        @Controller
 public class PostsController {
     @RequestMapping("/posts")
     @ResponseBody
     public String index() {
                return "Posts index page";
            }

             @RequestMapping("/posts/{id}")
     @ResponseBody
     public String show(@PathVariable long id) {
                return "Viewing post #" + id;
            }

             @RequestMapping("/posts/create")
     @ResponseBody
     public String showCreateForm() {
                return "This is where you create a post";
            }

             @RequestMapping
     @ResponseBody
     public String createPost() {
                return "Store in the database";
            }
 }