
# Maths functions
module MathsTools
  # Greatest Common Divisor, Euclidean algorithm
  def self.gcd(a, b)
    b.zero? ? a : gcd(b, a % b)
  end

  # Greatest Common Divisor Extend, Euclidean Extend
  def self.gcd_ext(a, b)
    return 1, 0, a if b.zero?
    x, y, q = gcd_ext(b, a % b) # q = GCD(a, b) = GCD(b, a%b)
    x, y = y, (x - (a / b) * y)
    [x, y, q]
  end
end