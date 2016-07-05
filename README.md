# DSLChocho

This is a domain speciifc langauge that solves N-queens problem. The tools used are: Xtend, Xpand, Chcoco library. Just import the project in Eclipe Luna(for code generation part, it works well with Luna) and run the program. You will be able to use the simple syntax to do constraint solving.  One simple program looks like this:



log("Queens Problem4")

var (Q1, 4)
var (Q2, 4)
var (Q3, 4)
var (Q4, 4)


notequal(Q1,Q2)
notequalplus(Q1,Q2,1)
notequalminus(Q1,Q2,1)

notequal(Q1,Q3)
notequalplus(Q1,Q3,2)
notequalminus(Q1,Q3,2)

notequal(Q1,Q4)
notequalplus(Q1,Q4,3)
notequalminus(Q1,Q4,3)

notequal(Q2,Q3)
notequalplus(Q2,Q3,1)
notequalminus(Q2,Q3,1)

notequal(Q2,Q4)
notequalplus(Q2,Q4,2)
notequalminus(Q2,Q4,2)

notequal(Q3,Q4)
notequalplus(Q3,Q4,1)
notequalminus(Q3,Q4,1)


solve(true)

log("Solution:")
showall(true)

