public class OOPSBannerApp {

    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] createOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    public static String[] createPPattern() {
        return new String[]{
                "  ****** ",
                " *     * ",
                "*       *",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    public static String[] createSPattern() {
        return new String[]{
                "  ****** ",
                " *       ",
                "*        ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', createOPattern()),
                new CharacterPatternMap('O', createOPattern()),
                new CharacterPatternMap('P', createPPattern()),
                new CharacterPatternMap('S', createSPattern())
        };

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                lineBuilder.append(letter.getPattern()[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}