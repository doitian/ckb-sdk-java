package org.nervos.ckb.utils;

import java.math.BigInteger;

/** Copyright © 2019 Nervos Foundation. All rights reserved. */
public class Utils {

  public static BigInteger shannonToCkb(BigInteger value) {
    return value.divide(BigInteger.TEN.pow(8));
  }

  public static BigInteger shannonToCkb(long value) {
    return BigInteger.valueOf(value).divide(BigInteger.TEN.pow(8));
  }

  public static BigInteger ckbToShannon(BigInteger value) {
    return value.multiply(BigInteger.TEN.pow(8));
  }

  public static BigInteger ckbToShannon(long value) {
    return BigInteger.valueOf(value).multiply(BigInteger.TEN.pow(8));
  }
}
