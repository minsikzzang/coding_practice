def swap(ar, a,b)
    ar[a], ar[b] = ar[b], ar[a]
end

def insertionSort(ar, p)
    (0...p - 1).each do |i|
        left = ar[i]
        right = ar[i + 1]
        if left > right
            swap(ar, i, i + 1)
            insertionSort(ar, i + 1)
        end
        puts ar.join(" ") if p == ar.length
    end
end

input = "1 4 3 5 6 2"
ar = input.strip.split(" ").map! {|i| i.to_i}
insertionSort(ar, ar.length)
