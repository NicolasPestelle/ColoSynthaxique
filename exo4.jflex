%%

%unicode
%line
%class EnleveCommentaire

%%

"//".* { ; }
\r\n {return new Yytoken("\n"); }
.+ {return new Yytoken(yytext()); }