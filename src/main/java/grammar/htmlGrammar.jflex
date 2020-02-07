package grammar;

%%

%public
%class HtmlLexer
%type String

%unicode

%{
%}

HtmlTag = <[^>]*>

Ampersand = &amp;
Lessthan = &lt;
Greaterthan = &gt;
Quote = &quot;

%state STRING

%%

<YYINITIAL> {
  {Ampersand}              { System.out.print("&"); }
  {Lessthan}               { System.out.print("<"); }
  {Greaterthan}            { System.out.print(">"); }
  {Quote}                  { System.out.print("\""); }

  {HtmlTag}                { System.out.print(""); }
}

[^]                        { System.out.print(yytext()); }