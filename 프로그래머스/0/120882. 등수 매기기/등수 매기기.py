def solution(score):
    answer = []
    temp = []
    for i in score:
        temp.append(sum(i))
    for i in temp:
        grade = 1
        for j in temp:
            if i < j:
                grade+=1
        answer.append(grade)
    return answer