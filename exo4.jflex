%%

%unicode
%line
%class EnleveCommentaire

%%

"//".* { ; }
\n {return new Yytoken("\n"); }
.+ {return new Yytoken(yytext()); }