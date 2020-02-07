# Usage
run ```maven clean package```

supply input file with extension ```.html```

run ```./myhtml2txt.sh <inputFile.html> <outputFile.txt>```


# About

This is an HTML to TXT translator written in Java. It utilizes JFlex to create a simple grammar to strip out HTML tags and convert a few key sequences into their respective text forms

 -  \&amp; = &
 - \&lt; = <
 - \&gt; = >
 - \&quot; = "

The ```grammar.htmlGrammar.jflex``` file contains the configuration used by JFlex to create the ```grammar.HtmlLexer``` Lexer class. This class is then utilized by ```Driver``` to take the input html file and parse through it token by token outputting to the output txt file.

I followed the  [documentation](https://jflex.de/manual.html) at in order to download and install JFlex and convert my grammar file into the Lexer class.
