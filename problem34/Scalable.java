package problem34;

/**
 * Interface for scalable shapes. Any class implementing this can be resized by a numeric factor.
 */
public interface Scalable {

  /**
   * Scales this object by the given factor. For example, a factor of 2.0 doubles the size.
   *
   * @param factor the scaling multiplier (should be positive)
   */
  void scale(double factor);
}
