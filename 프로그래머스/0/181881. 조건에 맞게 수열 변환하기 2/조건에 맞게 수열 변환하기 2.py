def solution(arr):
    x = 0
    while True:
        temp = arr[:]

        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] = arr[i] // 2
            elif arr[i] < 50 and arr[i] % 2 != 0:
                arr[i] = arr[i] * 2 + 1

        if arr == temp:
            break

        x += 1

    return x