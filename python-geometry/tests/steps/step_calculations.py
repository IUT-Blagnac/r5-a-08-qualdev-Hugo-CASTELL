from behave import *

from classes import Point


@given("I have a point on {x:n} and {y:n} coordinates")
def i_have_a_point_x_and_y_coordinates(context, x, y):
    context.point1 = Point(x, y)


@step("I have another point on {x2:g} and {y2:g} coordinates")
def i_have_another_point_on_x2_and_y2_coordinates(context, x2, y2):
    context.point2 = Point(x2, y2)


@step("I have a third point on {x3:g} and {y3:g} coordinates")
def i_have_another_point_on_x3_and_y3_coordinates(context, x3, y3):
    context.point3 = Point(x3, y3)


@when("I calculate the distance between them")
def i_calculate_the_distance_between_them(context):
    context.result = context.point1.distance(context.point2)


@when("I calculate the perimeter of the triangle made with them")
def i_calculate_the_perimeter_of_the_triangle_made_with_them(context):
    context.result = context.point1.distance(context.point2) + \
                     context.point2.distance(context.point3) + \
                     context.point3.distance(context.point1)


@then("I should get {result:g} as result")
def i_should_get_result_as_result(context, result):
    assert context.result == result

