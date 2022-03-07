package prog_1;

import java.util.ArrayList;
import java.util.List;

public interface MenuData {

    String mainMenuStr = """
            0 - Nothing
            1 - Appetizer
            2 - Main Course
            3 - Dessert
            """;
    String appetizerMenuStr = """
            0 - Nothing
            1 - Oysters
            2 - Grilled Octopus
            3 - Hummus
            """;
    String mainCourseMenuStr = """
            0 - Nothing
            1 - Grilled Chicken Sandwich
            2 - Vegetable fried rice
            3 - White rice and some sauce
            """;
    String desMenuStr = """
            0 - Nothing
            1 - Charlotte aux fraises
            2 - Takoyaki
            3 - Ice cream
            """;
    String topMenuStr = """
            0 - Nothing
            1 - Soy Sauce
            2 - Onions
            3 - Peppers
            """;

    List<String> mainMenuList = new ArrayList<>(List.of("Appetizer", "Main Course", "Dessert"));
    List<String> appMenuList = new ArrayList<>(List.of("Oysters", "Grilled Octopus", "Hummus"));
    List<String> mainCrsMenuList = new ArrayList<>(List.of("Grilled Chicken Sandwich",
            "Vegetable fried rice", "White rice white and some sauce"));
    List<String> desMenuList = new ArrayList<>(List.of("Charlotte aux fraises", "Takoyaki", "Ice cream"));
    List<String> topMenuList = new ArrayList<>(List.of("Soy Sauce", "Onions", "Peppers"));
}
