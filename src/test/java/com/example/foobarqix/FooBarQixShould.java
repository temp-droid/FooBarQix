package com.example.foobarqix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooBarQixShould {

    @Test
    void return_1_when_input_is_1() {
        // given
        String input = "1";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void return_FooFoo_when_input_is_3() {
        // given
        String input = "3";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooFoo");
    }

    @Test
    void return_BarBar_when_input_is_5() {
        // given
        String input = "5";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("BarBar");
    }

    @Test
    void return_Foo_when_input_is_6() {
        // given
        String input = "6";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    void return_QixQix_when_input_is_7() {
        // given
        String input = "7";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("QixQix");
    }

    @Test
    void return_Foo_when_input_is_9() {
        // given
        String input = "9";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    void return_Bar_asterisk_when_input_is_10() {
        // given
        String input = "10";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("Bar*");
    }

    @Test
    void return_Foo_when_input_is_13() {
        // given
        String input = "13";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    void return_FooBarBar_when_input_is_15() {
        // given
        String input = "15";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooBarBar");
    }

    @Test
    void return_FooQix_when_input_is_21() {
        // given
        String input = "21";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooQix");
    }

    @Test
    void return_FooFooFoo_when_input_is_33() {
        // given
        String input = "33";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooFooFoo");
    }

    @Test
    void return_FooBar_when_input_is_51() {
        // given
        String input = "51";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooBar");
    }

    @Test
    void return_BarFoo_when_input_is_53() {
        // given
        String input = "53";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("BarFoo");
    }

    @Test
    void return_1_asterisk_1_when_input_is_101() {
        // given
        String input = "101";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("1*1");
    }

    @Test
    void return_FooFoo_asterisk_Foo_when_input_is_303() {
        // given
        String input = "303";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooFoo*Foo");
    }

    @Test
    void return_FooBarQix_asterisk_Bar_when_input_is_303() {
        // given
        String input = "105";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooBarQix*Bar");
    }

    @Test
    void return_FooQix_asterisk_asterisk_when_input_is_10101() {
        // given
        String input = "10101";
        // when
        String result = FooBarQix.compute(input);
        // then
        assertThat(result).isEqualTo("FooQix**");
    }
}
