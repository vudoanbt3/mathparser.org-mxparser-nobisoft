/*
 * @(#)Calculus.java        5.0.4    2022-05-22
 *
 * MathParser.org-mXparser DUAL LICENSE AGREEMENT as of date 2022-05-22
 * The most up-to-date license is available at the below link:
 * - https://mathparser.org/mxparser-license
 *
 * AUTHOR: Copyright 2010 - 2022 Mariusz Gromada - All rights reserved
 * PUBLISHER: INFIMA - https://payhip.com/infima
 *
 * SOFTWARE means source code and/or binary form and/or documentation.
 * PRODUCT: MathParser.org-mXparser SOFTWARE
 * LICENSE: DUAL LICENSE AGREEMENT
 *
 * BY INSTALLING, COPYING, OR OTHERWISE USING THE PRODUCT, YOU AGREE TO BE
 * BOUND BY ALL OF THE TERMS AND CONDITIONS OF THE DUAL LICENSE AGREEMENT.
 *
 * AUTHOR & PUBLISHER provide the PRODUCT under the DUAL LICENSE AGREEMENT
 * model designed to meet the needs of both non-commercial use as well as
 * commercial use.
 *
 * NON-COMMERCIAL USE means any use or activity where a fee is not charged
 * and the purpose is not the sale of a good or service, and the use or
 * activity is not intended to produce a profit. NON-COMMERCIAL USE examples:
 *
 * 1. Free Open-Source Software ("FOSS").
 * 2. Non-commercial use in research, scholarly and education.
 *
 * COMMERCIAL USE means any use or activity where a fee is charged or the
 * purpose is the sale of a good or service, or the use or activity is
 * intended to produce a profit. COMMERCIAL USE examples:
 *
 * 1. OEMs (Original Equipment Manufacturers).
 * 2. ISVs (Independent Software Vendors).
 * 3. VARs (Value Added Resellers).
 * 4. Other distributors that combine and distribute commercially licensed
 *    software.
 *
 * IN CASE YOU WANT TO USE THE PRODUCT COMMERCIALLY, YOU MUST PURCHASE THE
 * APPROPRIATE LICENSE FROM "INFIMA" ONLINE STORE, STORE ADDRESS:
 *
 * 1. https://mathparser.org/order-commercial-license
 * 2. https://payhip.com/infima
 *
 * NON-COMMERCIAL LICENSE
 *
 * Redistribution and use of the PRODUCT in source and/or binary forms,
 * with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * 1. Redistributions of source code must retain unmodified content of the
 *    entire MathParser.org-mXparser DUAL LICENSE AGREEMENT, including
 *    definition of NON-COMMERCIAL USE, definition of COMMERCIAL USE,
 *    NON-COMMERCIAL LICENSE conditions, COMMERCIAL LICENSE conditions, and
 *    the following DISCLAIMER.
 * 2. Redistributions in binary form must reproduce the entire content of
 *    MathParser.org-mXparser DUAL LICENSE AGREEMENT in the documentation
 *    and/or other materials provided with the distribution, including
 *    definition of NON-COMMERCIAL USE, definition of COMMERCIAL USE,
 *    NON-COMMERCIAL LICENSE conditions, COMMERCIAL LICENSE conditions, and
 *    the following DISCLAIMER.
 * 3. Any form of redistribution requires confirmation and signature of
 *    the NON-COMMERCIAL USE by successfully calling the method:
 *       License.iConfirmNonCommercialUse(...)
 *    The method call takes place only internally for logging purposes and
 *    there is no connection with other external services and no data is
 *    sent or collected. The lack of a method call (or its successful call)
 *    does not affect the operation of the PRODUCT in any way. Please see
 *    the API documentation.
 *
 * COMMERCIAL LICENSE
 *
 *  1. Before purchasing a commercial license, AUTHOR & PUBLISHER allow you
 *     to download, install and use up to three copies of the PRODUCT to
 *     perform integration tests, confirm the quality of the PRODUCT and
 *     its suitability. The testing period should be limited to fourteen
 *     days. Tests should be performed under the conditions of test
 *     environments. The purpose of the tests must not be to generate profit.
 *  2. Provided that you purchased a license from "INFIMA" online store
 *     (store address: https://mathparser.org/order-commercial-license or
 *     https://payhip.com/infima), and you comply with all below terms and
 *     conditions, and you have acknowledged and understood the following
 *     DISCLAIMER, AUTHOR & PUBLISHER grant you a nonexclusive license
 *     including the following rights:
 *  3. The license has been granted only to you, i.e., the person or entity
 *     that made the purchase, who is identified and confirmed by the data
 *     provided during the purchase.
 *  4. In case you purchased a license in the "ONE-TIME PURCHASE" model,
 *     the license has been granted only for the PRODUCT version specified
 *     in the purchase. The upgrade policy gives you additional rights and
 *     is described in the dedicated section below.
 *  5. In case you purchased a license in the "SUBSCRIPTION" model, you can
 *     install and use any version of the PRODUCT, but only during the
 *     subscription validity period.
 *  6. In case you purchased a "SINGLE LICENSE" you can install and use the
 *     PRODUCT from one workstation.
 *  7. Additional copies of the PRODUCT can be installed and used from more
 *     than one workstation; however, this number is limited to the number
 *     of workstations purchased as per order.
 *  8. In case you purchased a "SITE LICENSE ", the PRODUCT can be installed
 *     and used from all workstations located at your premises.
 *  9. You may incorporate the unmodified PRODUCT into your own products
 *     and software.
 * 10. If you purchased a license with the "SOURCE CODE" option, you may
 *     modify the PRODUCT's source code and incorporate the modified source
 *     code into your own products and/or software.
 * 11. Provided that the license validity period has not expired, you may
 *     distribute your product and/or software with the incorporated
 *     PRODUCT royalty-free.
 * 12. You may make copies of the PRODUCT for backup and archival purposes.
 * 13. Any form of redistribution requires confirmation and signature of
 *     the COMMERCIAL USE by successfully calling the method:
 *        License.iConfirmCommercialUse(...)
 *     The method call takes place only internally for logging purposes and
 *     there is no connection with other external services and no data is
 *     sent or collected. The lack of a method call (or its successful call)
 *     does not affect the operation of the PRODUCT in any way. Please see
 *     the API documentation.
 * 14. AUTHOR & PUBLISHER reserve all rights not expressly granted to you
 *     in this agreement.
 *
 * ADDITIONAL CLARIFICATION ON WORKSTATION
 *
 * A workstation is a device, a remote device, or a virtual device, used by
 * you, your employees, or other entities to whom you have commissioned the
 * tasks. For example, the number of workstations may refer to the number
 * of software developers, engineers, architects, scientists, and other
 * professionals who use the PRODUCT on your behalf. The number of
 * workstations is not the number of copies of your end-product that you
 * distribute to your end-users.
 *
 * By purchasing the COMMERCIAL LICENSE, you only pay for the number of
 * workstations, while the number of copies of your final product
 * (delivered to your end-users) is not limited.
 *
 * UPGRADE POLICY
 *
 * The PRODUCT is versioned according to the following convention:
 *
 *    [MAJOR].[MINOR].[PATCH]
 *
 * 1. COMMERCIAL LICENSE holders can install and use the updated version
 *    for bug fixes free of charge, i.e. if you have purchased a license
 *    for the [MAJOR].[MINOR] version (e.g.: 5.0), you can freely install
 *    all the various releases specified in the [PATCH] version (e.g.: 5.0.2).
 *    The license terms remain unchanged after the update.
 * 2. COMMERCIAL LICENSE holders for [MAJOR].[MINOR] version (e.g.: 5.0)
 *    can install and use the updated version [MAJOR].[MINOR + 1] free of
 *    charge, i.e., plus one release in the [MINOR] range (e.g.: 5.1). The
 *    license terms remain unchanged after the update.
 * 3. COMMERCIAL LICENSE holders who wish to upgrade their version, but are
 *    not eligible for the free upgrade, can claim a discount when
 *    purchasing the upgrade. For this purpose, please contact us via e-mail.
 *
 * DISCLAIMER
 *
 * THIS PRODUCT IS PROVIDED BY AUTHOR & PUBLISHER "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL AUTHOR OR PUBLISHER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS PRODUCT, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 *
 * THE VIEWS AND CONCLUSIONS CONTAINED IN THE PRODUCT AND DOCUMENTATION ARE
 * THOSE OF THE AUTHORS AND SHOULD NOT BE INTERPRETED AS REPRESENTING
 * OFFICIAL POLICIES, EITHER EXPRESSED OR IMPLIED, OF AUTHOR OR PUBLISHER.
 *
 * CONTACT
 *
 * - e-mail: info@mathparser.org
 * - website: https://mathparser.org
 * - source code: https://github.com/mariuszgromada/MathParser.org-mXparser
 * - online store: https://mathparser.org/order-commercial-license
 * - online store: https://payhip.com/infima
 */
package org.mariuszgromada.math.mxparser.mathcollection;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

/**
 * Calculus - numerical integration, differentiation, etc...
 *
 * @author         <b>Mariusz Gromada</b><br>
 *                 <a href="https://mathparser.org" target="_blank">MathParser.org - mXparser project page</a><br>
 *                 <a href="https://github.com/mariuszgromada/MathParser.org-mXparser" target="_blank">mXparser on GitHub</a><br>
 *                 <a href="https://payhip.com/INFIMA" target="_blank">INFIMA place to purchase a commercial MathParser.org-mXparser software license</a><br>
 *                 <a href="mailto:info@mathparser.org">info@mathparser.org</a><br>
 *                 <a href="https://scalarmath.org/" target="_blank">ScalarMath.org - a powerful math engine and math scripting language</a><br>
 *                 <a href="https://play.google.com/store/apps/details?id=org.mathparser.scalar.lite" target="_blank">Scalar Lite</a><br>
 *                 <a href="https://play.google.com/store/apps/details?id=org.mathparser.scalar.pro" target="_blank">Scalar Pro</a><br>
 *                 <a href="https://mathspace.pl" target="_blank">MathSpace.pl</a><br>
 *
 * @version        5.0.0
 */
public final class Calculus {
	/**
	 * Derivative type specification
	 */
	public static final int LEFT_DERIVATIVE = 1;
	public static final int RIGHT_DERIVATIVE = 2;
	public static final int GENERAL_DERIVATIVE = 3;
	/**
	 * Trapezoid numerical integration
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument
	 * @param      a                   form a ...
	 * @param      b                   ... to b
	 * @param      eps                 the epsilon (error)
	 * @param      maxSteps            the maximum number of steps
	 *
	 * @return     Integral value as double.
	 *
	 * @see        Expression
	 */
	public static double integralTrapezoid(Expression f, Argument x, double a, double b,
										   double eps, int maxSteps) {
		double h = 0.5*(b-a);
		double s = mXparser.getFunctionValue(f, x, a)
					+ mXparser.getFunctionValue(f, x, b)
					+ 2 * mXparser.getFunctionValue(f, x, a + h);
		double intF = s*h*0.5;
		double intFprev = 0;
		double t = a;
		int i, j;
		int n = 1;
		for (i = 1; i <= maxSteps; i++) {
			n += n;
			t = a + 0.5*h;
			intFprev = intF;
			for (j = 1; j <= n; j++) {
				if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
				s += 2 * mXparser.getFunctionValue(f, x, t);
				t += h;
			}
			h *= 0.5;
			intF = s*h*0.5;
			if (Math.abs(intF - intFprev) <= eps)
				return intF;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return intF;
	}
	/**
	 * Numerical derivative at x = x0
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument
	 * @param      x0                  at point x = x0
	 * @param      derType             derivative type (LEFT_DERIVATIVE, RIGHT_DERIVATIVE,
	 *                                 GENERAL_DERIVATIVE
	 * @param      eps                 the epsilon (error)
	 * @param      maxSteps            the maximum number of steps
	 *
	 * @return     Derivative value as double.
	 *
	 * @see        Expression
	 */
	public static double derivative(Expression f, Argument x, double x0,
									int derType, double eps, int maxSteps) {
		final double START_DX = 0.1;
		int step = 0;
		double error = 2.0*eps;
		double y0 = 0.0;
		double derF = 0.0;
		double derFprev = 0.0;
		double dx = 0.0;
		if (derType == LEFT_DERIVATIVE)
			dx = -START_DX;
		else
			dx = START_DX;
		double dy = 0.0;
		if ( (derType == LEFT_DERIVATIVE) || (derType == RIGHT_DERIVATIVE) ) {
			y0 = mXparser.getFunctionValue(f, x, x0);
			dy = mXparser.getFunctionValue(f, x, x0+dx) - y0;
			derF = dy/dx;
		} else
			derF = ( mXparser.getFunctionValue(f, x, x0+dx) - mXparser.getFunctionValue(f, x, x0-dx) ) / (2.0*dx);
		do {
			derFprev = derF;
			dx = dx/2.0;
			if ( (derType == LEFT_DERIVATIVE) || (derType == RIGHT_DERIVATIVE) ) {
				dy = mXparser.getFunctionValue(f, x, x0+dx) - y0;
				derF = dy/dx;
			} else
				derF = ( mXparser.getFunctionValue(f, x, x0+dx) - mXparser.getFunctionValue(f, x, x0-dx) ) / (2.0*dx);
			error = Math.abs(derF - derFprev);
			step++;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		} while ( (step < maxSteps) && ( (error > eps) || Double.isNaN(derF) ));
		return derF;
	}
	/**
	 * Numerical n-th derivative at x = x0 (you should avoid calculation
	 * of derivatives with order higher than 2).
	 *
	 * @param      f                   the expression
	 * @param      n                   the deriviative order
	 * @param      x                   the argument
	 * @param      x0                  at point x = x0
	 * @param      derType             derivative type (LEFT_DERIVATIVE, RIGHT_DERIVATIVE,
	 *                                 GENERAL_DERIVATIVE
	 * @param      eps                 the epsilon (error)
	 * @param      maxSteps            the maximum number of steps
	 *
	 * @return     Derivative value as double.
	 *
	 * @see        Expression
	 */
	public static double derivativeNth(Expression f, double n, Argument x,
									   double x0, int derType, double eps, int maxSteps) {
		n = Math.round(n);
		int step = 0;
		double error = 2*eps;
		double derFprev = 0;
		double dx = 0.01;
		double derF = 0;
		if (derType == RIGHT_DERIVATIVE)
			for (int i = 1; i <= n; i++)
				derF += MathFunctions.binomCoeff(-1,n-i) * MathFunctions.binomCoeff(n,i) * mXparser.getFunctionValue(f,x,x0+i*dx);
		else
			for (int i = 1; i <= n; i++)
				derF += MathFunctions.binomCoeff(-1,i)*MathFunctions.binomCoeff(n,i) * mXparser.getFunctionValue(f,x,x0-i*dx);
		derF = derF / Math.pow(dx, n);
		do {
			derFprev = derF;
			dx = dx/2.0;
			derF = 0;
			if (derType == RIGHT_DERIVATIVE)
				for (int i = 1; i <= n; i++)
					derF += MathFunctions.binomCoeff(-1,n-i) * MathFunctions.binomCoeff(n,i) * mXparser.getFunctionValue(f,x,x0+i*dx);
			else
				for (int i = 1; i <= n; i++)
					derF += MathFunctions.binomCoeff(-1,i)*MathFunctions.binomCoeff(n,i) * mXparser.getFunctionValue(f,x,x0-i*dx);
			derF = derF / Math.pow(dx, n);
			error = Math.abs(derF - derFprev);
			step++;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		} while ( (step < maxSteps) && ( (error > eps) || Double.isNaN(derF) ));
		return derF;
	}
	/**
	 * Forward difference(1) operator (at x = x0)
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument name
	 * @param      x0                  x = x0
	 *
	 * @return     Forward difference(1) value calculated at x0.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double forwardDifference(Expression f, Argument x, double x0) {
		if (Double.isNaN(x0))
			return Double.NaN;
		double xb = x.getArgumentValue();
		double delta = mXparser.getFunctionValue(f, x, x0+1) - mXparser.getFunctionValue(f, x, x0);
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Forward difference(1) operator (at current value of argument x)
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument name
	 *
	 * @return     Forward difference(1) value calculated at the current value of argument x.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double forwardDifference(Expression f, Argument x) {
		double xb = x.getArgumentValue();
		if (Double.isNaN(xb))
			return Double.NaN;
		double fv = f.calculate();
		x.setArgumentValue(xb + 1);
		double delta = f.calculate() - fv;
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Backward difference(1) operator (at x = x0).
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument name
	 * @param      x0                  x = x0
	 *
	 * @return     Backward difference value calculated at x0.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double backwardDifference(Expression f, Argument x, double x0) {
		if (Double.isNaN(x0))
			return Double.NaN;
		double xb = x.getArgumentValue();
		double delta = mXparser.getFunctionValue(f, x, x0) - mXparser.getFunctionValue(f, x, x0-1);
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Backward difference(1) operator (at current value of argument x)
	 *
	 * @param      f                   the expression
	 * @param      x                   the argument name
	 *
	 * @return     Backward difference(1) value calculated at the current value of argument x.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double backwardDifference(Expression f, Argument x) {
		double xb = x.getArgumentValue();
		if (Double.isNaN(xb))
			return Double.NaN;
		double fv = f.calculate();
		x.setArgumentValue(xb - 1);
		double delta = fv - f.calculate();
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Forward difference(h) operator (at x = x0)
	 *
	 * @param      f                   the expression
	 * @param      h                   the difference
	 * @param      x                   the argument name
	 * @param      x0                  x = x0
	 *
	 * @return     Forward difference(h) value calculated at x0.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double forwardDifference(Expression f, double h, Argument x, double x0) {
		if (Double.isNaN(x0))
			return Double.NaN;
		double xb = x.getArgumentValue();
		double delta = mXparser.getFunctionValue(f, x, x0+h) - mXparser.getFunctionValue(f, x, x0);
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Forward difference(h) operator (at the current value of the argument x)
	 *
	 * @param      f                   the expression
	 * @param      h                   the difference
	 * @param      x                   the argument name
	 *
	 * @return     Forward difference(h) value calculated at at the current value of the argument x.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double forwardDifference(Expression f, double h, Argument x) {
		double xb = x.getArgumentValue();
		if (Double.isNaN(xb))
			return Double.NaN;
		double fv = f.calculate();
		x.setArgumentValue(xb + h);
		double delta = f.calculate() - fv;
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Backward difference(h) operator (at x = x0)
	 *
	 * @param      f                   the expression
	 * @param      h                   the difference
	 * @param      x                   the argument name
	 * @param      x0                  x = x0
	 *
	 * @return     Backward difference(h) value calculated at x0.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double backwardDifference(Expression f, double h, Argument x, double x0) {
		if (Double.isNaN(x0))
			return Double.NaN;
		double xb = x.getArgumentValue();
		double delta = mXparser.getFunctionValue(f, x, x0) - mXparser.getFunctionValue(f, x, x0-h);
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Backward difference(h) operator (at the current value of the argument x)
	 *
	 * @param      f                   the expression
	 * @param      h                   the difference
	 * @param      x                   the argument name
	 *
	 * @return     Backward difference(h) value calculated at at the current value of the argument x.
	 *
	 * @see        Expression
	 * @see        Argument
	 */
	public static double backwardDifference(Expression f, double h, Argument x) {
		double xb = x.getArgumentValue();
		if (Double.isNaN(xb))
			return Double.NaN;
		double fv = f.calculate();
		x.setArgumentValue(xb - h);
		double delta = fv - f.calculate();
		x.setArgumentValue(xb);
		return delta;
	}
	/**
	 * Brent solver (Brent root finder)
	 *
	 * @param f  Function given in the Expression form
	 * @param x  Argument
	 * @param a  Left limit
	 * @param b  Right limit
	 * @param eps      Epsilon value (accuracy)
	 * @param maxSteps Maximum number of iterations
	 * @return   Function root - if found, otherwise Double.NaN.
	 */
	public static double solveBrent(Expression f, Argument x, double a, double b, double eps, double maxSteps) {
		double  fa, fb, fc, fs, c, c0, c1, c2;
		double tmp, d, s;
		boolean mflag;
		int iter;
		/*
		 * If b lower than b then swap
		 */
		if (b < a) {
			tmp = a;
			a = b;
			b = tmp;
		}
		fa = mXparser.getFunctionValue(f, x, a);
		fb = mXparser.getFunctionValue(f, x, b);
		/*
		 * If already root then no need to solve
		 */
		if (MathFunctions.abs(fa) <= eps) return a;
		if (MathFunctions.abs(fb) <= eps) return b;
		if (b == a) return Double.NaN;
		/*
		 * If root not bracketed the perform random search
		 */
		if (fa * fb > 0) {
			boolean rndflag = false;
			double ap, bp;
			for (int i = 0; i < maxSteps; i++) {
				ap = ProbabilityDistributions.rndUniformContinuous(a, b);
				bp = ProbabilityDistributions.rndUniformContinuous(a, b);
				if (bp < ap) {
					tmp = ap;
					ap = bp;
					bp = tmp;
				}
				fa = mXparser.getFunctionValue(f, x, ap);
				fb = mXparser.getFunctionValue(f, x, bp);
				if (MathFunctions.abs(fa) <= eps) return ap;
				if (MathFunctions.abs(fb) <= eps) return bp;
				if (fa * fb < 0) {
					rndflag = true;
					a = ap;
					b = bp;
					break;
				}
				if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
			}
			if (rndflag == false) return Double.NaN;
		}
		c = a;
		d = c;
		fc = mXparser.getFunctionValue(f, x, c);
		if (MathFunctions.abs(fa) < MathFunctions.abs(fb)) {
			tmp = a;
			a = b;
			b = tmp;
			tmp = fa;
			fa = fb;
			fb = tmp;
		}
		mflag = true;
		iter = 0;
		/*
		 * Perform actual Brent algorithm
		 */
		while ((MathFunctions.abs(fb) > eps) && ( MathFunctions.abs(b-a) > eps) && (iter < maxSteps)) {
			if ( (fa != fc) && (fb != fc) ) {
				c0 = (a * fb * fc) / ((fa - fb) * (fa - fc));
				c1 = (b * fa * fc) / ((fb - fa) * (fb - fc));
				c2 = (c * fa * fb) / ((fc - fa) * (fc - fb));
				s = c0 + c1 + c2;
			} else
				s = b - (fb * (b - a)) / (fb - fa);
			if (	( s < (3 * (a + b) / 4) || s > b) ||
					( (mflag == true) && MathFunctions.abs(s-b) >= (MathFunctions.abs(b-c)/2) ) ||
					( (mflag == false) && MathFunctions.abs(s-b) >= (MathFunctions.abs(c-d)/2) )	) {
				s = (a+b)/2;
				mflag = true;
			} else
				mflag = true;
			fs = mXparser.getFunctionValue(f, x, s);
			d = c;
			c = b;
			fc = fb;
			if ((fa * fs) < 0)
				b = s;
			else
				a = s;
			if (MathFunctions.abs(fa) < MathFunctions.abs(fb)) {
				tmp = a;
				a = b;
				b = tmp;
				tmp = fa;
				fa = fb;
				fb = tmp;
			}
			iter++;
			if (mXparser.isCurrentCalculationCancelled()) return Double.NaN;
		}
		return MathFunctions.round(b, MathFunctions.decimalDigitsBefore(eps)-1);
	}
}