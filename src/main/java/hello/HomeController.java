package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

        @Autowired
        private BookRepository bookRepository;

        @RequestMapping("/")
        @ResponseBody
        public String index() {
                Book book = bookRepository.findOne(1);
                return book.getTitle();
        }
}