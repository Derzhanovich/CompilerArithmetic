int func(int a, int b)
	while ( a != b )
		if (a > b)
			a = a - b
		else
			b = b - a        
	return a


main()
	int x
	int y
	int res
	x = 2
	y = 3
	res = func(x, y)
	write res


