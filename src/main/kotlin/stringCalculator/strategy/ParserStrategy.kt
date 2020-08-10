package stringCalculator.strategy

interface ParserStrategy {
    fun parsingNumber(inputValue: String): List<Int>

    companion object {
        fun getParserStrategy(userInputTemplate: String): ParserStrategy {
            val hasCustomRegex = CustomRegexParserStrategy.CUSTOM_REGEX_PATTERN.matches(userInputTemplate)
            return if (hasCustomRegex) CustomRegexParserStrategy() else NormalParserStrategy()
        }
    }
}
