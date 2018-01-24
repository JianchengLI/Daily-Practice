gem 'minitest'
require 'minitest/autorun'
require_relative '../math_tools'

class MathsToolsTest < Minitest::Test



  # Called before every test method runs. Can be used
  # to set up fixture information.
  def setup
    # Do nothing
  end

  # Called after every test method runs. Can be used to tear
  # down fixture information.

  def teardown
    # Do nothing
  end

  def test_gcd
    assert_equal 21, MathsTools.gcd(1071, 462)
    assert_equal 2, MathsTools.gcd(10, 8)
  end

  def test_gcd_ext
    assert_equal [-3, 7, 21], MathsTools.gcd_ext(1071, 462)
    assert_equal [-7, 11, 1], MathsTools.gcd_ext(47, 30)
    assert_equal [-367, 2, 1], MathsTools.gcd_ext(17, 3120)
  end
end