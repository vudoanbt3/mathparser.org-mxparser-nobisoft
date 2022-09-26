/*
 * @(#)ParserSymbol.java        5.0.4    2022-05-22
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
package org.mariuszgromada.math.mxparser.parsertokens;

import org.mariuszgromada.math.mxparser.mXparser;
/**
 * Parser symbols - mXparser tokens definition.
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
 * @version        5.0.3
 */
public final class ParserSymbol {
	/*
	 * ParserSymbol - reg exp patterns.
	 */
	public static final String DIGIT							= "[0-9]";
	public static final String DIGIT_B1							= "1";
	public static final String DIGIT_B2							= "[01]";
	public static final String DIGIT_B3							= "[0-2]";
	public static final String DIGIT_B4							= "[0-3]";
	public static final String DIGIT_B5							= "[0-4]";
	public static final String DIGIT_B6							= "[0-5]";
	public static final String DIGIT_B7							= "[0-6]";
	public static final String DIGIT_B8							= "[0-7]";
	public static final String DIGIT_B9							= "[0-8]";
	public static final String DIGIT_B10						= "[0-9]";
	public static final String DIGIT_B11						= "[0-9aA]";
	public static final String DIGIT_B12						= "[0-9a-bA-B]";
	public static final String DIGIT_B13						= "[0-9a-cA-C]";
	public static final String DIGIT_B14						= "[0-9a-dA-D]";
	public static final String DIGIT_B15						= "[0-9a-eA-E]";
	public static final String DIGIT_B16						= "[0-9a-fA-F]";
	public static final String DIGIT_B17						= "[0-9a-gA-G]";
	public static final String DIGIT_B18						= "[0-9a-hA-H]";
	public static final String DIGIT_B19						= "[0-9a-iA-I]";
	public static final String DIGIT_B20						= "[0-9a-jA-J]";
	public static final String DIGIT_B21						= "[0-9a-kA-K]";
	public static final String DIGIT_B22						= "[0-9a-lA-L]";
	public static final String DIGIT_B23						= "[0-9a-mA-M]";
	public static final String DIGIT_B24						= "[0-9a-nA-N]";
	public static final String DIGIT_B25						= "[0-9a-oA-O]";
	public static final String DIGIT_B26						= "[0-9a-pA-P]";
	public static final String DIGIT_B27						= "[0-9a-qA-Q]";
	public static final String DIGIT_B28						= "[0-9a-rA-R]";
	public static final String DIGIT_B29						= "[0-9a-sA-S]";
	public static final String DIGIT_B30						= "[0-9a-tA-T]";
	public static final String DIGIT_B31						= "[0-9a-uA-U]";
	public static final String DIGIT_B32						= "[0-9a-vA-V]";
	public static final String DIGIT_B33						= "[0-9a-wA-W]";
	public static final String DIGIT_B34						= "[0-9a-xA-X]";
	public static final String DIGIT_B35						= "[0-9a-yA-Y]";
	public static final String DIGIT_B36						= "[0-9a-zA-Z]";
	public static final String INTEGER							= DIGIT + "(" + DIGIT + ")*";
	public static final String DEC_FRACT						= "(" + INTEGER + ")?" + "\\." + INTEGER;
	public static final String DEC_FRACT_OR_INT					= "(" + DEC_FRACT + "|" + INTEGER + ")";
	public static final String DECIMAL_REG_EXP					= "[+-]?" + DEC_FRACT_OR_INT + "([eE][+-]?" + INTEGER + ")?";
	public static final String DECIMAL_SCIENTIFIC_REG_EXP		= "[+-]?" + DEC_FRACT_OR_INT + "([eE][+-]?" + INTEGER + ")";
	public static final String BASE1_REG_EXP					= "[+-]?[bB]1\\.(" + DIGIT_B1 + ")*";
	public static final String BASE2_REG_EXP					= "[+-]?[bB][2]?\\." + DIGIT_B2 + "(" + DIGIT_B2 + ")*";
	public static final String BASE3_REG_EXP					= "[+-]?[bB]3\\." + DIGIT_B3 + "(" + DIGIT_B3 + ")*";
	public static final String BASE4_REG_EXP					= "[+-]?[bB]4\\." + DIGIT_B4 + "(" + DIGIT_B4 + ")*";
	public static final String BASE5_REG_EXP					= "[+-]?[bB]5\\." + DIGIT_B5 + "(" + DIGIT_B5 + ")*";
	public static final String BASE6_REG_EXP					= "[+-]?[bB]6\\." + DIGIT_B6 + "(" + DIGIT_B6 + ")*";
	public static final String BASE7_REG_EXP					= "[+-]?[bB]7\\." + DIGIT_B7 + "(" + DIGIT_B7 + ")*";
	public static final String BASE8_REG_EXP					= "[+-]?([bB]8|[oO])\\." + DIGIT_B8 + "(" + DIGIT_B8 + ")*";
	public static final String BASE9_REG_EXP					= "[+-]?[bB]9\\." + DIGIT_B9 + "(" + DIGIT_B9 + ")*";
	public static final String BASE10_REG_EXP					= "[+-]?[bB]10\\." + DIGIT_B10 + "(" + DIGIT_B10 + ")*";
	public static final String BASE11_REG_EXP					= "[+-]?[bB]11\\." + DIGIT_B11 + "(" + DIGIT_B11 + ")*";
	public static final String BASE12_REG_EXP					= "[+-]?[bB]12\\." + DIGIT_B12 + "(" + DIGIT_B12 + ")*";
	public static final String BASE13_REG_EXP					= "[+-]?[bB]13\\." + DIGIT_B13 + "(" + DIGIT_B13 + ")*";
	public static final String BASE14_REG_EXP					= "[+-]?[bB]14\\." + DIGIT_B14 + "(" + DIGIT_B14 + ")*";
	public static final String BASE15_REG_EXP					= "[+-]?[bB]15\\." + DIGIT_B15 + "(" + DIGIT_B15 + ")*";
	public static final String BASE16_REG_EXP					= "[+-]?([bB]16|[hH])\\." + DIGIT_B16 + "(" + DIGIT_B16 + ")*";
	public static final String BASE17_REG_EXP					= "[+-]?[bB]17\\." + DIGIT_B17 + "(" + DIGIT_B17 + ")*";
	public static final String BASE18_REG_EXP					= "[+-]?[bB]18\\." + DIGIT_B18 + "(" + DIGIT_B18 + ")*";
	public static final String BASE19_REG_EXP					= "[+-]?[bB]19\\." + DIGIT_B19 + "(" + DIGIT_B19 + ")*";
	public static final String BASE20_REG_EXP					= "[+-]?[bB]20\\." + DIGIT_B20 + "(" + DIGIT_B20 + ")*";
	public static final String BASE21_REG_EXP					= "[+-]?[bB]21\\." + DIGIT_B21 + "(" + DIGIT_B21 + ")*";
	public static final String BASE22_REG_EXP					= "[+-]?[bB]22\\." + DIGIT_B22 + "(" + DIGIT_B22 + ")*";
	public static final String BASE23_REG_EXP					= "[+-]?[bB]23\\." + DIGIT_B23 + "(" + DIGIT_B23 + ")*";
	public static final String BASE24_REG_EXP					= "[+-]?[bB]24\\." + DIGIT_B24 + "(" + DIGIT_B24 + ")*";
	public static final String BASE25_REG_EXP					= "[+-]?[bB]25\\." + DIGIT_B25 + "(" + DIGIT_B25 + ")*";
	public static final String BASE26_REG_EXP					= "[+-]?[bB]26\\." + DIGIT_B26 + "(" + DIGIT_B26 + ")*";
	public static final String BASE27_REG_EXP					= "[+-]?[bB]27\\." + DIGIT_B27 + "(" + DIGIT_B27 + ")*";
	public static final String BASE28_REG_EXP					= "[+-]?[bB]28\\." + DIGIT_B28 + "(" + DIGIT_B28 + ")*";
	public static final String BASE29_REG_EXP					= "[+-]?[bB]29\\." + DIGIT_B29 + "(" + DIGIT_B29 + ")*";
	public static final String BASE30_REG_EXP					= "[+-]?[bB]30\\." + DIGIT_B30 + "(" + DIGIT_B30 + ")*";
	public static final String BASE31_REG_EXP					= "[+-]?[bB]31\\." + DIGIT_B31 + "(" + DIGIT_B31 + ")*";
	public static final String BASE32_REG_EXP					= "[+-]?[bB]32\\." + DIGIT_B32 + "(" + DIGIT_B32 + ")*";
	public static final String BASE33_REG_EXP					= "[+-]?[bB]33\\." + DIGIT_B33 + "(" + DIGIT_B33 + ")*";
	public static final String BASE34_REG_EXP					= "[+-]?[bB]34\\." + DIGIT_B34 + "(" + DIGIT_B34 + ")*";
	public static final String BASE35_REG_EXP					= "[+-]?[bB]35\\." + DIGIT_B35 + "(" + DIGIT_B35 + ")*";
	public static final String BASE36_REG_EXP					= "[+-]?[bB]36\\." + DIGIT_B36 + "(" + DIGIT_B36 + ")*";
	public static final String BASE_OTHER_REG_EXP				=
			"("
					+ BASE1_REG_EXP
					+ "|" + BASE2_REG_EXP
					+ "|" + BASE3_REG_EXP
					+ "|" + BASE4_REG_EXP
					+ "|" + BASE5_REG_EXP
					+ "|" + BASE6_REG_EXP
					+ "|" + BASE7_REG_EXP
					+ "|" + BASE8_REG_EXP
					+ "|" + BASE9_REG_EXP
					+ "|" + BASE10_REG_EXP
					+ "|" + BASE11_REG_EXP
					+ "|" + BASE12_REG_EXP
					+ "|" + BASE13_REG_EXP
					+ "|" + BASE14_REG_EXP
					+ "|" + BASE15_REG_EXP
					+ "|" + BASE16_REG_EXP
					+ "|" + BASE17_REG_EXP
					+ "|" + BASE18_REG_EXP
					+ "|" + BASE19_REG_EXP
					+ "|" + BASE20_REG_EXP
					+ "|" + BASE21_REG_EXP
					+ "|" + BASE22_REG_EXP
					+ "|" + BASE23_REG_EXP
					+ "|" + BASE24_REG_EXP
					+ "|" + BASE25_REG_EXP
					+ "|" + BASE26_REG_EXP
					+ "|" + BASE27_REG_EXP
					+ "|" + BASE28_REG_EXP
					+ "|" + BASE29_REG_EXP
					+ "|" + BASE30_REG_EXP
					+ "|" + BASE31_REG_EXP
					+ "|" + BASE32_REG_EXP
					+ "|" + BASE33_REG_EXP
					+ "|" + BASE34_REG_EXP
					+ "|" + BASE35_REG_EXP
					+ "|" + BASE36_REG_EXP
			+ ")";
	public static final String UNICODE_NAME_REG_EXP = "(" +
					"\u03b1" /* α */
					+ "|" + "\u03b2" /* β */
					+ "|" + "\u03b3" /* γ */
					+ "|" + "\u03b4" /* δ */
					+ "|" + "\u03b5" /* ε */
					+ "|" + "\u03b6" /* ζ */
					+ "|" + "\u03b7" /* η */
					+ "|" + "\u03b8" /* θ */
					+ "|" + "\u03b9" /* ι */
					+ "|" + "\u03ba" /* κ */
					+ "|" + "\u03bb" /* λ */
					+ "|" + "\u03bc" /* μ */
					+ "|" + "\u03bd" /* ν */
					+ "|" + "\u03be" /* ξ */
					+ "|" + "\u03bf" /* ο */
					+ "|" + "\u03c0" /* π */
					+ "|" + "\u03c1" /* ρ */
					+ "|" + "\u03c2" /* ς */
					+ "|" + "\u03c3" /* σ */
					+ "|" + "\u03c4" /* τ */
					+ "|" + "\u03c5" /* υ */
					+ "|" + "\u03c6" /* φ */
					+ "|" + "\u03c7" /* χ */
					+ "|" + "\u03c8" /* ψ */
					+ "|" + "\u03c9" /* ω */
					+ "|" + "\u0391" /* Α */
					+ "|" + "\u0392" /* Β */
					+ "|" + "\u0393" /* Γ */
					+ "|" + "\u0394" /* Δ */
					+ "|" + "\u0395" /* Ε */
					+ "|" + "\u0396" /* Ζ */
					+ "|" + "\u0397" /* Η */
					+ "|" + "\u0398" /* Θ */
					+ "|" + "\u0399" /* Ι */
					+ "|" + "\u039a" /* Κ */
					+ "|" + "\u039b" /* Λ */
					+ "|" + "\u039c" /* Μ */
					+ "|" + "\u039d" /* Ν */
					+ "|" + "\u039e" /* Ξ */
					+ "|" + "\u039f" /* Ο */
					+ "|" + "\u03a0" /* Π */
					+ "|" + "\u03a1" /* Ρ */
					+ "|" + "\u03a3" /* Σ */
					+ "|" + "\u03a4" /* Τ */
					+ "|" + "\u03a5" /* Υ */
					+ "|" + "\u03a6" /* Φ */
					+ "|" + "\u03a7" /* Χ */
					+ "|" + "\u03a8" /* Ψ */
					+ "|" + "\u03a9" /* Ω */
					+ "|" + "\u2211" /* ∑ */
					+ "|" + "\u220f" /* ∏ */
					+ "|" + "\u213f" /* ℿ */
					+ "|" + "\u2206" /* ∆ */
					+ "|" + "\u2207" /* ∇ */
					+ "|" + "\u222b" /* ∫ */
					+ "|" + "\u213c" /* ℼ */
					+ "|" + "\u2107" /* ℇ */
					+ "|" + "\u2147" /* ⅇ */
					+ "|" + "\u212f" /* ℯ */
					+ "|" + "\u2202" /* ∂ */
			+ ")";
	public static final String FRACTION							= "(" + INTEGER + "\\_)?" + INTEGER + "\\_" + INTEGER;
	public static final String nameOnlyTokenRegExp				= "(" + "([a-zA-Z_])+([a-zA-Z0-9_])*" + "|" + UNICODE_NAME_REG_EXP + ")";
	public static final String unitOnlyTokenRegExp				= "\\[" + nameOnlyTokenRegExp + "\\]";
	public static final String nameOnlyTokenOptBracketsRegExp	= "(" +  nameOnlyTokenRegExp + "|" + unitOnlyTokenRegExp + ")";
	public static final String nameTokenRegExp					= "(\\s)*" + nameOnlyTokenRegExp + "(\\s)*";
	public static final String nameTokenOptBracketsRegExp		= "(\\s)*" + nameOnlyTokenOptBracketsRegExp + "(\\s)*";
	public static final String paramsTokenRegeExp				= "(\\s)*\\(" + "(" + nameTokenRegExp + ",(\\s)*)*" + nameTokenRegExp + "\\)(\\s)*";
	public static final String constArgDefStrRegExp				= nameTokenRegExp + "=" + "(\\s)*(.)+(\\s)*";
	public static final String constUnitgDefStrRegExp			= nameTokenOptBracketsRegExp + "=" + "(\\s)*(.)+(\\s)*";
	public static final String functionDefStrRegExp				= nameTokenRegExp + paramsTokenRegeExp + "=" + "(\\s)*(.)+(\\s)*";
	public static final String function1ArgDefStrRegExp 		= nameTokenRegExp + "(\\s)*\\(" + nameTokenRegExp + "(\\s)*\\)(\\s)*" + "=" + "(\\s)*(.)+(\\s)*";
	public static final String functionVariadicDefStrRegExp		= nameTokenRegExp + "(\\s)*" + "\\(" + "(\\s)*" + "\\.\\.\\." + "(\\s)*" + "\\)" + "(\\s)*" + "=" + "(\\s)*(.)+(\\s)*";

	/*
	 * ParserSymbol - token type id.
	 */
	public static final int TYPE_ID 						= 20;
	public static final String TYPE_DESC					= "Parser Symbol";
	/*
	 * ParserSymbol - tokens id.
	 */
	public static final int LEFT_PARENTHESES_ID 			= 1;
	public static final int RIGHT_PARENTHESES_ID			= 2;
	public static final int COMMA_ID						= 3;
	public static final int BLANK_ID						= 4;
	public static final int NUMBER_ID						= 1;
	public static final int NUMBER_TYPE_ID					= 0;

	/*
	 * ParserSymbol - tokens key words.
	 */
	public static final String LEFT_PARENTHESES_STR 		= "(";
	public static final String RIGHT_PARENTHESES_STR		= ")";
	public static final String COMMA_STR					= ",";
	public static final String SEMI_STR						= ";";
	public static final String BLANK_STR					= " ";
	public static final String NUMBER_STR					= "_num_";
	/*
	 * ParserSymbol - syntax.
	 */
	public static final String LEFT_PARENTHESES_SYN 		= "( ... )";
	public static final String RIGHT_PARENTHESES_SYN		= "( ... )";
	public static final String COMMA_SYN					= "(a1, ... ,an)";
	public static final String SEMI_SYN						= "(a1; ... ;an)";
	public static final String BLANK_SYN					= " ";
	public static final String NUMBER_SYN					= "Integer (since v.1.0): 1, -2; Decimal (since v.1.0): 0.2, -0.3, 1.2; Leading zero (since v.4.1): 001, -002.1; Scientific notation (since v.4.2): 1.2e-10, 1.2e+10, 2.3e10; No leading zero (since v.4.2): .2, -.212; Fractions (since v.4.2): 1_2, 2_1_3, 14_3; Other systems (since v.4.1): b1.111, b2.1001, b3.12021, b16.af12, h.af1, b.1001, o.0127";
	public static final String NUMBER_SYN_INT				= "1, -2, 3";
	public static final String NUMBER_SYN_DEC				= "0.1, -0.2, 1.3";
	public static final String NUMBER_SYN_WITH_ZEROS		= "001, -000.2, 00001.3";
	public static final String NUMBER_SYN_NO_ZEROS			= ".1, -.2, .3";
	public static final String NUMBER_SYN_SCI				= "1.2e10, 1.2e+10, -3.2e-5, 2.eE+10";
	public static final String NUMBER_SYN_FRAC				= "1_2, 2_3, 2_3_4, -2_4";
	public static final String NUMBER_SYN_OTH_BASE			= "\tb1.111, b2.1001, b3.12021, -b16.af12, h.af1, b.1001, o.0127";

	/*
	 * ParserSymbol - tokens description.
	 */
	public static final String LEFT_PARENTHESES_DESC 		= "Left parentheses";
	public static final String RIGHT_PARENTHESES_DESC		= "Right parentheses";
	public static final String COMMA_DESC					= "Comma (function parameters)";
	public static final String SEMI_DESC					= "Semicolon (function parameters)";
	public static final String BLANK_DESC					= "Blank (whitespace) character";
	public static final String NUMBER_DESC					= "Decimal number";
	public static final String NUMBER_REG_DESC				= "Regular expression for decimal numbers";
	public static final String NUMBER_DESC_INT				= "Integer numbers";
	public static final String NUMBER_DESC_DEC				= "Decimal numbers";
	public static final String NUMBER_DESC_WITH_ZEROS		= "Integer / Decimal numbers with leading zeros";
	public static final String NUMBER_DESC_NO_ZEROS			= "Integer / Decimal numbers without leading zeros";
	public static final String NUMBER_DESC_SCI				= "Decimal numbers in scientific notation";
	public static final String NUMBER_DESC_FRAC				= "Fractions";
	public static final String NUMBER_DESC_OTH_BASE			= "Numbers in other numeral bases";
	public static final String UNICODE_MATH					= " - unicode math symbol";
	/*
	 * ParserSymbol - since.
	 */
	public static final String LEFT_PARENTHESES_SINCE 		= mXparser.NAMEv10;
	public static final String RIGHT_PARENTHESES_SINCE		= mXparser.NAMEv10;
	public static final String COMMA_SINCE					= mXparser.NAMEv10;
	public static final String SEMI_SINCE					= mXparser.NAMEv10;
	public static final String BLANK_SINCE					= mXparser.NAMEv42;
	public static final String NUMBER_SINCE					= mXparser.NAMEv10;
	public static final String NUMBER_SINCE_INT				= mXparser.NAMEv10;
	public static final String NUMBER_SINCE_DEC				= mXparser.NAMEv10;
	public static final String NUMBER_SINCE_WITH_ZEROS		= mXparser.NAMEv41;
	public static final String NUMBER_SINCE_NO_ZEROS		= mXparser.NAMEv42;
	public static final String NUMBER_SINCE_SCI				= mXparser.NAMEv42;
	public static final String NUMBER_SINCE_FRAC			= mXparser.NAMEv42;
	public static final String NUMBER_SINCE_OTH_BASE		= mXparser.NAMEv42;
}