package tema5.setup5;

public enum BrowserType5 {
    CHROME("Google Chrome"), // fiecare enumerare actioneaza ca un initializare a clasei cu ajutorul constructorului
    EDGE("Microsoft Edge"),  // daca avem ceva in paranteza, trebuie sa implementam acel constructor
    FIREFOX("Firefox Browser"),
    OPERA("Opera browser"),
    SAFARI;

    // final String browserValue; // final = valoarea nu poate fi schimbata odata ce a fost initializata
     String browserValue;
    BrowserType5(String browserValue) {
        this.browserValue = browserValue;
    }

    BrowserType5() {

    }
}
