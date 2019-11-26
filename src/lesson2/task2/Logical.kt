@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean = TODO()

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean = TODO()


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int = TODO()

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
* окружности с центром в (x2, y2) и радиусом r2.
* Вернуть true, если утверждение верно
*/
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double
): Boolean = TODO()

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    var min1: Int = 0
    var min2: Int = 0
    var min3: Int = 0

    if ((a >= b) && (b >= c)) {
        min1 = a
        min2 = b
        min3 = c
    }
    if ((a >= c) && (c >= b)) {
        min1 = a
        min2 = c
        min3 = b
    }
    if ((b >= c) && (c >= a)) {
        min1 = b
        min2 = c
        min3 = a
    }
    if ((b >= a) && (a >= c)) {
        min1 = b
        min2 = a
        min3 = c
    }
    if ((c >= a) && (a >= b)) {
        min1 = c
        min2 = a
        min3 = b
    }
    if ((c >= b) && (b >= a)) {
        min1 = c
        min2 = b
        min3 = a
    }
    println("$a  $b  $c")
    println("$min1 $min2 $min3 $r $s")
    return if (((min1 >= r) && (min2 >= s)) || ((min2 >= r) && (min1 >= s))) true
    else false

    }

