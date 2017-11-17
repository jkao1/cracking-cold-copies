def find_longest_path(rooms):
    N = len(rooms)
    lookup = {}
    for r in range(N):
        for c in range(N):
            lookup[rooms[r][c]] = (r, c)
    tracker = [0 for _ in range(N**2)]
    directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
    for i in range(1, 1 + N**2):
        r, c = lookup[i]

        for d in directions:
            nr = r + d[0]
            nc = c + d[1]
            if nr < 0 or nr >= N or nc < 0 or nc >= N:
                continue
            tracker[r * N + c] = max(tracker[r * N + c], tracker[nr * N + nc] + 1)
    return max(tracker)

if __name__ == '__main__':
    try:
        while True:
            size = int(raw_input())
            rooms = []
            for i in range(size):
                rooms.append([int(s) for s in raw_input().split(" ")])
            max_rooms = find_longest_path(rooms)
            print(max_rooms)
    except EOFError:
        print('finished')    