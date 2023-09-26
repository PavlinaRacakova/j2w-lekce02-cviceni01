package cz.czechitas.java2webapps.lekce2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class MainController {

    @GetMapping("/datum")
    public ModelAndView datum() {
        ModelAndView result = new ModelAndView("datum");
        DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.forLanguageTag("cs-CZ"));
        result.addObject("datum", LocalDate.now().format(DATE_FORMATTER));
        return result;
    }

    @GetMapping("/cas")
    public ModelAndView cas() {
        ModelAndView result = new ModelAndView("cas");
        DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", Locale.forLanguageTag("cs-CZ"));
        result.addObject("cas", LocalTime.now().format(TIME_FORMATTER));
        return result;
    }


}
