all: app

app: $(subst .c,.o,$(wildcard src/*.c))
	$(CC) $^ -o $@

clean:
	rm app
	rm $(wildcard src/*.o)
