package english.app;

public class QuizBook {

    public static String[] questions = new String [] {
            "This is a lion.",
            "Sherlock Holmes is a detective",
            "The number is six (6).",
            "The word banana starts with letter B.",
            "We have 4 seasons.",
            "The season with the longest days is winter.",
            "Sofa is a house stuff.",
            "To sleep we need a pillow.",
            "In the image is a carrot.",
            "An orange fruit has the orange color.",
            "The color in the picture is blue.",
            "After bath we need a towel",
            "The person who save the people lives is doctor",
            "This person who paint is called painter.",
            "This is a dog.",
            "Peach is a vegetable",
            "The animal in the picture is a cat.",

    };

    public static int[] images = new int [] {
            R.drawable.lionquiz, R.drawable.detective,R.drawable.five, R.drawable.banana, R.drawable.seasons,
            R.drawable.winter, R.drawable.sofa, R.drawable.pillow, R.drawable.peach,
            R.drawable.portocaliu,R.drawable.bluequiz,R.drawable.towel,R.drawable.doctor,R.drawable.artist,
            R.drawable.dog,R.drawable.peach,R.drawable.cat
    };

    public static boolean[] answers = new boolean[]{
            true,true, false, true, true, false, true, true, false, true, true, true, true, true, true, false,true
    };
}