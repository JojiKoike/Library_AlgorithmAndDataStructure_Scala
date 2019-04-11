package geometry

abstract class Structure
case class Point(x: Float, y: Float) extends Structure
case class Vector(override val x: Float, override val y: Float) extends Point(x, y)
case class Segment (p1: Point, p2: Point) extends Structure

