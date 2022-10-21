package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionBracketTest {
    
    @Test
    @DisplayName("괄호 잘 풀리는지")
    void pushTest() {
        SolutionBracket solutionBracket = new SolutionBracket();
        Assertions.assertEquals(true, solutionBracket.solution("()()"));
        Assertions.assertEquals(true, solutionBracket.solution("(())()"	));
        Assertions.assertEquals(false, solutionBracket.solution(")()("));
        Assertions.assertEquals(false, solutionBracket.solution("(()("));
    }

}