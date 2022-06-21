package com.training.classes.simpleclasses.task7;

import java.awt.geom.Point2D;

// 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
//вычисления площади, периметра и точки пересечения медиан.
public class Triangle {
	Point2D.Double a;
	Point2D.Double b;
	Point2D.Double c;

	public Triangle(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
		if (!isTriangleExist(a, b, c)) throw new IllegalArgumentException("Triangle is NOT exist!");
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static boolean isTriangleExist(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
		return a.distance(b) + a.distance(c) > b.distance(c) && b.distance(a) + b.distance(c) > a.distance(c)
				&& c.distance(a) + c.distance(b) > a.distance(b) ? true : false;
	}

	public double areaOfTriangle() {
		double semiPerimeter = perimeterOFTriangle() / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - a.distance(b)) * (semiPerimeter - a.distance(c))
				* (semiPerimeter - b.distance(c)));
	}

	public double perimeterOFTriangle() {
		return a.distance(b) + a.distance(c) + b.distance(c);
	}

	public Point2D.Double centroidOfTriangle() {
		return new Point2D.Double((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
	}
}
