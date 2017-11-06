package kusha.spring5tutorial.controllers;

import kusha.spring5tutorial.domain.Category;
import kusha.spring5tutorial.domain.UnitOfMeasure;
import kusha.spring5tutorial.repositories.CategoryRepository;
import kusha.spring5tutorial.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;

    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository,
            UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping(value = { "", "/", "/index" }, method = RequestMethod.GET)
    public String getIndexPage() {
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Cat Id is: " + category.get().getId());
        System.out.println("UOM Id is: " + uom.get().getId());
        return "index";
    }
}
