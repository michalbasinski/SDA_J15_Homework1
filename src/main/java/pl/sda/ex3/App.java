package pl.sda.ex3;

class App {
    public static void main(String[] args) {
        FileLatinMorseReader fileLatinMorseReader = new FileLatinMorseReader();

        LatinToMorseTranslator translator =
                new LatinToMorseTranslator(fileLatinMorseReader.getDictionary());

        String textToTranslate = "SOS";

        System.out.println(translator.translate(textToTranslate));
    }
}
