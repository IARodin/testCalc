package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println(" after all");

    }

    @AfterEach
    public void afterEach(){
        System.out.println(" after each");

    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не верный ответ");
    }
    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)

    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не верный ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Проверка суммирования 3")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не верный ответ");
    }

    @Test
    @DisplayName("Проверка вычитания 1")
    @Timeout(10)
    @Tag("dif")
    void diff() {
        Calc calc = new Calc();
        int result = calc.diff(6, 1);
        Assertions.assertEquals(5, result, "Не верный ответ");
    }
    @Test
    @DisplayName("Проверка вычитания 2")
    @Timeout(10)

    void diff2() {
        Calc calc = new Calc();
        int result = calc.diff(6, 1);
        Assertions.assertEquals(5, result, "Не верный ответ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @DisplayName("Проверка вычитания 3")
    @CsvSource({"3, 2, 1", "2, -1, 3", "0, 0, 0"})
    @Tag("paramdif")
    void diff3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.diff(a, b);
        Assertions.assertEquals(expectedResult, result, "Не верный ответ");
    }

}