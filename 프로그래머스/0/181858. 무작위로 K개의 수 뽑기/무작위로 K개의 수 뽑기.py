def solution(arr, k):
    answer = []
    i = 0
    while i < len(arr):
        if len(answer) == k:
            break
        else:
            if arr[i] not in answer:
                answer.append(arr[i])   
            i+=1
    if len(answer) < k:
        for j in range((k-len(answer))):
            answer.append(-1)
    return answer