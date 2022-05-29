
package devsought;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToMatchSentence {

    public static void main(String... args) {

        //you can uncomment any of the below str variable to test each of the scenarios discussed.  
        String str = "Lorem Ipsum is simply dummy text of the (printing) and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        // String str = "In academic writing, readers expect each paragraph to have a sentence or two that captures its main point. They’re often called “topic sentences,” though many writing instructors prefer to call them “key sentences”. There are at least two downsides of the phrase “topic sentence”. First, it makes it seem like the paramount job of that sentence is simply to announce the topic of the paragraph. Second, it makes it seem like the topic sentence must always be a single grammatical sentence. Calling it a “key sentence” reminds us that it expresses the central idea of the paragraph. And sometimes a question or a two-sentence construction functions as the key.";
        // String str = "Key sentences in academic writing do two things. First, they establish the main point that the rest of the paragraph supports. Second, they situate each paragraph within the sequence of the argument, a task that requires transitioning from the prior paragraph. Consider these two examples:[2].";           
        // String str = "In academic writing, readers expect each paragraph to have a sentence or two that captures its main point. They’re often called \"topic sentences,\" though many writing instructors prefer to call them “key sentences”. There are at least two downsides of the phrase “topic sentence”. First, it makes it seem like the paramount job of that sentence is simply to announce the topic of the paragraph. Second, it makes it seem like the topic sentence must always be a single grammatical sentence. Calling it a “key sentence” reminds us that it expresses the central idea of the paragraph. And sometimes a question or a two-sentence construction functions as the key.";
        // String str = "Mary’s mother said to her, “get in the house before it starts raining”.";
        // String str="Mary's mother said to her, \"get in the house before it starts raining\".";
        // String str="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        //Pattern pattern = Pattern.compile("\\b[\\[\\]\\w, '\":;$^@#%(){}“”’-]+[.?!]");
        //or use pattern below
        Pattern pattern = Pattern.compile("\\b[\\w\\p{Space}“”’\\p{Punct}&&[^.?!]]+[.?!]");
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }

        System.out.println("Paragraph has " + count + " sentences.");

    }

}
